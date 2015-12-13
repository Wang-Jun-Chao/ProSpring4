package com.apress.prospring4.ch3;

/**
 * Author: 王俊超
 * Date: 2015-12-08
 * Time: 11:13
 * Declaration: All Rights Reserved !!!
 */
public interface ArtworkSender {
    void sendArtwork(String artworkPath, Recipient recipient);
    String getFriendlyName();
    String getShortName();
}
