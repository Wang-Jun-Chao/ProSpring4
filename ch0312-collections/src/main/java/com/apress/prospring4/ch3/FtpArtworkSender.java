package com.apress.prospring4.ch3;

/**
 * Author: 王俊超
 * Date: 2015-12-08
 * Time: 11:14
 * Declaration: All Rights Reserved !!!
 */
public class FtpArtworkSender  implements ArtworkSender {
    public void sendArtwork(String artworkPath, Recipient recipient) {
        // ftp logic here...
    }

    public String getFriendlyName() {
        return "File Transfer Protocol";
    }

    public String getShortName() {
        return "ftp";
    }
}
