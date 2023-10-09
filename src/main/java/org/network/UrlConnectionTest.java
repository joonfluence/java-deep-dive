package org.network;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionTest {
    public static void main(String args[]) {
        // getUrlConnection();
        // getHtmlByBufferReader();
        getFileByFileStream();
    } // main

    private static void getFileByFileStream() {
        URL url = null;
        InputStream in = null;
        FileOutputStream out = null;
        String address = "https://kuzuro.blogspot.com/2018/09/blog-post.html";

        int ch = 0;

        try {
            url = new URL(address);
            in = url.openStream();
            out = new FileOutputStream("blog-post.txt");

            while((ch=in.read()) !=-1) {
                out.write(ch);
            }
            in.close();
            out.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static void getHtmlByBufferReader() {
        URL url = null;
        BufferedReader input = null;
        String address = "http://www.codechobo.com/sample/hello.html";
        String line = "";

        try {
            url  = new URL(address);
            input = new BufferedReader(new InputStreamReader(url.openStream()));

            while((line=input.readLine()) !=null) {
                System.out.println(line);
            }
            input.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static void getUrlConnection() {
        String address = "https://kuzuro.blogspot.com/2018/09/blog-post.html";

        try {
            URL url = new URL(address);
            URLConnection conn = url.openConnection();
            System.out.println("conn.toString():" + conn);
            System.out.println("getAllowUserInteraction():" + conn.getAllowUserInteraction());
            System.out.print("\tgetConnectTimeout():" + conn.getConnectTimeout());
            System.out.println("getContent():" + conn.getContent());
            System.out.println("getContentEncoding():" + conn.getContentEncoding());
            System.out.print("\tgetContentLength():" + conn.getContentLength());
            System.out.println("getContentType():" + conn.getContentType());
            System.out.print("\tgetDate():" + conn.getDate());
            System.out.println("getDefaultAllowUserInteraction():" + conn.getDefaultAllowUserInteraction());
            System.out.println("getDefaultUseCaches():" + conn.getDefaultUseCaches());
            System.out.print("\tgetDoInput():" + conn.getDoInput());
            System.out.println("getDoOutput():" + conn.getDoOutput());
            System.out.print("\tgetExpiration():" + conn.getExpiration());
            System.out.println("getHeaderFields():" + conn.getHeaderFields());
            System.out.println("getIfModifiedSince():" + conn.getIfModifiedSince());
            System.out.print("\tgetLastModified():" + conn.getLastModified());
            System.out.println("getReadTimeout():" + conn.getReadTimeout());
            System.out.println("getURL():" + conn.getURL());
            System.out.println("getUseCaches():" + conn.getUseCaches());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
