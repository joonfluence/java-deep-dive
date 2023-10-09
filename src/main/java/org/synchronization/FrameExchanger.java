package org.synchronization;

import java.awt.*;

public class FrameExchanger  {

    private long framesStoredCount = 0;
    private long framesTakenCount  = 0;

    private boolean hasNewFrame = false;

    private Frame frame = null;

    // called by Frame producing thread
    public void storeFrame(Frame frame) {
        this.frame = frame;
        this.framesStoredCount++;
        this.hasNewFrame = true;
    }

    public static void main(String[] args) throws InterruptedException {
        FrameExchanger frameExchanger = new FrameExchanger();
        frameExchanger.takeFrame();
        //sync();
    }

    // called by Frame drawing thread
    public Frame takeFrame() {
        System.out.println("framesStoredCount = " + framesStoredCount);
        System.out.println("hasNewFrame = " + hasNewFrame);
        
        while(!hasNewFrame) {
            //busy wait until new frame arrives
        }

        Frame newFrame = this.frame;
        this.framesTakenCount++;
        this.hasNewFrame = false;
        System.out.println("hasNewFrame = " + hasNewFrame);
        return newFrame;
    }

}
