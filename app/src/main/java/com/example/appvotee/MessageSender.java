package com.example.appvotee;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MessageSender extends AsyncTask<String, Void, Void> {
    public Exception exception;

    @Override
    protected Void doInBackground(String... params) {
        try {
            try {
                Socket socket = new Socket("192.168.15.44",8888);
                PrintWriter outToServer = new PrintWriter(
                        new OutputStreamWriter(
                                socket.getOutputStream()));
                outToServer.print(params[0]);
                outToServer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            this.exception = e;
            return null;
        }
        return null;
    }
}
