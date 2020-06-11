package com.test.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BetterLogger {
  private static BetterLogger logger = null;

  private final String logFile = "demo_better_log.txt";
  private PrintWriter writer;

  public BetterLogger() {
    try {
      FileWriter fw = new FileWriter(logFile);
      writer = new PrintWriter(fw, true);
    } catch (IOException e) {}
  }

  public static synchronized BetterLogger getInstance(){
    if(logger == null)
      logger = new BetterLogger();
    return logger;
  }

  public void logWithdraw (String account, double amount) {
    writer.println("WITHDRAW (" + account + "): " + amount + "$");
  }

  public void logDeposit (String account, double amount) {
    writer.println("DEPOSIT (" + account + "): " + amount + "$");
  }

  public void logTransfer (String fromAccount, String toAccount, double amount) {
    writer.println("TRANSFER (" + fromAccount + "->" + toAccount + "): " + amount + "$");
  }

  public static void main(String[] args) {
    BetterLogger bLogger1 = BetterLogger.getInstance();
    BetterLogger bLogger2 = BetterLogger.getInstance();
    BetterLogger bLogger3 = BetterLogger.getInstance();

    bLogger1.logDeposit("0001", 80.5);
    bLogger2.logWithdraw("0002", 100);
    bLogger1.logTransfer("0001", "0003", 40);
    bLogger3.logDeposit("0004", 56.74);
    bLogger2.logWithdraw("0005", 30);
  }
}
