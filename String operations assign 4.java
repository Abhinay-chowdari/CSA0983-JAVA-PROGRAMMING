import java.io.*;
import java.util.string;
class StringOperations 
{
public static void main(String[] args) 
{
String sampleString = "The quick brown fox jumps over the lazy dog.";
//1
String string1 = "Hello";
String string2 = "hello";
boolean isSame = compareStringsIgnoreCase(string1, string2);
System.out.println("Are the strings equal (ignoring case)? " + isSame);
//2
String endsWith = "dog.";
boolean endsWithMatch = endsWithMatch(sampleString, endsWith);
System.out.println("Does the string end with '" + endsWith + "'? " + endsWithMatch);
//3
String dateTime = getCurrentDateTime("dd/MM/yyyy HH:mm:ss");
System.out.println("Current date and time: " + dateTime);
//4
System.out.println("Indices of alphabet characters:");
getAlphabetIndices(sampleString);
//5
String regex = "fox";
String replacement = "cat";
String replacedString = replaceSubstring(sampleString, regex, replacement);
System.out.println("Replaced string: " + replacedString);
//6
int startPosition = 4;
int endPosition = 9;
String substring = getSubstring(sampleString, startPosition, endPosition);
System.out.println("Substring between positions " + startPosition + " and " + endPosition + ": " + substring);
//7
String stringWithWhitespace = "    Hello, World!    ";
String trimmedString = trimWhitespace(stringWithWhitespace);
System.out.println("Trimmed string: '" + trimmedString + "'");
//8
String lowercaseString = convertToLowercase(sampleString);
System.out.println("Lowercase string: " + lowercaseString);
//9
int stringLength = getStringLength(sampleString);
System.out.println("String length: " + stringLength);
//10
String string3 = "The quick brown fox jumps over the lazy dog.";
boolean isSameData = checkSameData(sampleString, string3);
System.out.println("Do the strings contain the same data? " + isSameData);
}
public static boolean compareStringsIgnoreCase(String str1, String str2)
{
return str1.equalsIgnoreCase(str2);
}
public static boolean endsWithMatch(String str, String endsWith) 
{
return str.endsWith(endsWith);
}
public static String getCurrentDateTime(String format) 
{
SimpleDateFormat sdf = new SimpleDateFormat(format);
Date currentDate = new Date();
return sdf.format(currentDate);
}
public static void getAlphabetIndices(String str) 
{
for (char c = 'a'; c <= 'z'; c++) 
{
  int index = str.toLowerCase().indexOf(c);
   if (index != -1) 
   {
    System.out.println(c + ": " + index);
   }
}
}
public static String replaceSubstring(String str, String regex, String replacement) 
{
return str.replaceAll(regex, replacement);
}
public static String getSubstring(String str, int start, int end) 
{
return str.substring(start, end);
}
public static String trimWhitespace(String str) 
{
return str.trim();
}
public static String convertToLowercase(String str)
{
return str.toLowerCase();
}
public static int getStringLength(String str)
{
return str.length();
}
public static boolean checkSameData(String str1, String str2) 
{
return str1.equals(str2);
}
}
