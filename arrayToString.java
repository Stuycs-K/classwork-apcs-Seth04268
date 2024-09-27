public class arrayToString {
  public static String arrayIntToString(int [] toConvert) {
    String returnString = "[";
    for (int i = 0; i < toConvert.length; i++) {
    if (i < toConvert.length - 1) {
      returnString += toConvert[i] + ", ";
    }
    else {
      returnString += toConvert[i];
    }
    return(returnString + "]");
  }
}
  public static String arrayStringToString(String [] toConvert) {
    String returnString = "[";
    for (int i = 0; i < toConvert.length; i++) {
      if (i < toConvert.length - 1) {
      returnString += toConvert[i] + ", ";
    }
    else {
      returnString += toConvert[i];
    }
  }
    return(returnString + "]");
}
}
