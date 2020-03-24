package tddjunit;

public class RemovingA {

public String remove(String string) {
String s = string;
int l = string.length();
if(string.charAt(0) == 'A'&& (string.charAt(1) == 'A')) {
s = string.substring(2, l);
}
else if(string.charAt(1) == 'A') {

s = string.substring(0,1)+string.substring(2, l);
}
else if(string.charAt(0) == 'A') {

s =string.substring(1, l);
}
return s;
}


}