package javanew;

public class Insaf {

	public static void main(String[] args) {
String str="abhijith";
char[] ch=str.toCharArray();
int freq=0,count=0;
 for(int i=0;i<ch.length-1;i++){
count=0;
for(int j=i+1;j<ch.length;j++){
if(ch[i]==ch[j]&&ch[j]!=' '){
count++;
ch[j]=' ';
} 
}
if(count>0){
freq++;
}
}
System.out.println(freq);
}
}
