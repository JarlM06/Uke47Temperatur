package com.example.uke47temperatur;

public class Temp {
    private int[] tempArray = {-3,-2,2,7,12,16,18,17,12,7,3,-2};

    public int getTemp(String month) {
      return switch (month) {
          default:
              // Siden brukeren ikke kan skrive måned, men må velge mellom en liste kommer 'default' aldri til å kjøre
              yield 0;
          case "januar":
              yield tempArray[0];
          case "februar":
              yield tempArray[1];
          case "mars":
              yield tempArray[2];
          case "april":
              yield tempArray[3];
          case "mai":
              yield tempArray[4];
          case "juni":
              yield tempArray[5];
          case "juli":
              yield tempArray[6];
          case "august":
              yield tempArray[7];
          case "september":
              yield tempArray[8];
          case "oktober":
              yield tempArray[9];
          case "november":
              yield tempArray[10];
          case "desember":
              yield tempArray[11];
      };
    }
}
