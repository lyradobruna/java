public class Detyra7_7_2
{ public String removeDuplicateLetters(String s)
  { String answer="";
    for (int i=0; i!=s.length(); i=i+1)
    { if ( notFind(answer, s.charAt(i)) )
      { answer=answer+s.charAt(i); }
    }
   return answer;
  }
  
  private boolean notFind(String a, char c)
  { boolean find=true;
    for (int j=0; j!=a.length(); j=j+1)
    { find=find&&(c!=a.charAt(j)); }
   return find;
  }
  
  public static void main(String[] args)
  { Detyra7_7_2 d=new Detyra7_7_2();
    System.out.println(d.removeDuplicateLetters("butterflies"));
  }
}