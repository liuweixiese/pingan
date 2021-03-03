package com.atpingan.xiancheng;

/**
 * @author shkstart
 * @create 2021-02-25 14:50
 */
public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while(true) {
            System.out.println(message);
        }
    }
}
