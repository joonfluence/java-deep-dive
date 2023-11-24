package org.grammar.network;

import java.io.IOException;
import java.net.*;
import java.util.Arrays;

public class IpAndUrl {
    public static void main(String[] args) {
        // getIpAndAddress();
        try {
            getUrl();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    } // main

    private static void getIpAndAddress() {
        InetAddress ip = null;
        InetAddress[] ipArr = null;

        try {
            ip = InetAddress.getByName("www.naver.com");
            System.out.println("getHostName() :"+ip.getHostName());
            System.out.println("getHostAddress() :"+ip.getHostAddress());
            System.out.println("toString() :"+ip.toString());

            byte[] ipAddr = ip.getAddress();
            System.out.println("getAddress() :"+ Arrays.toString(ipAddr));

            String result = "";
            for(int i=0; i < ipAddr.length;i++)
                result += (ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i])+".";
            System.out.println("getAddress()+256 :"+result);
            System.out.println();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            ip = InetAddress.getLocalHost();
            System.out.println("getHostName() :"+ip.getHostName());
            System.out.println("getHostAddress() :"+ip.getHostAddress());
            System.out.println();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            ipArr = InetAddress.getAllByName("www.naver.com");

            for(int i=0; i < ipArr.length; i++)
                System.out.println("ipArr["+i+"] :" + ipArr[i]);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    private static void getUrl() throws IOException, URISyntaxException {
        URL url = new URL("https://kuzuro.blogspot.com/2018/09/blog-post.html");

        System.out.println("url.getAuthority():"+ url.getAuthority());
        System.out.println("url.getContent():"+ url.getContent());
        System.out.println("url.getDefaultPort():"+ url.getDefaultPort());
        System.out.println("url.getPort():"+ url.getPort());
        System.out.println("url.getFile():"+ url.getFile());
        System.out.println("url.getHost():"+ url.getHost());
        System.out.println("url.getPath():"+ url.getPath());
        System.out.println("url.getProtocol():"+ url.getProtocol());
        System.out.println("url.getQuery():"+ url.getQuery());
        System.out.println("url.getRef():"+ url.getRef());
        System.out.println("url.getUserInfo():"+ url.getUserInfo());
        System.out.println("url.toExternalForm():"+ url.toExternalForm());
        System.out.println("url.toURI():"+ url.toURI());
    }
}
