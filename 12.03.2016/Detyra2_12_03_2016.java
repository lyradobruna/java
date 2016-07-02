import javax.swing.*;
public class Detyra2_12_03_2016
{ public static void main(String[] args)
  { int viti=new Integer(JOptionPane.showInputDialog("Jepe nje vit:")).intValue();
    if (((((viti%4)==0)&&((viti%100)!=0))||((viti%400)==0))&&((viti>0)))
    { JOptionPane.showMessageDialog(null,"Ky eshte vit i brisht.");}
    else { if (viti<=0)
    { JOptionPane.showMessageDialog(null,"Ky vit nuk ekziston.");}
    else 
    {JOptionPane.showMessageDialog(null,"Ky nuk eshte vit i brisht.");} 
    }
  }
}