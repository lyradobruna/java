import javax.swing.*;
public class VOTIMI
{ public static void main(String[] args)
  { while (true)
    { int vjet�t=new Integer(JOptionPane.showInputDialog("Sa vjet i keni?")).intValue();
      if (vjet�t<18)
      { JOptionPane.showMessageDialog(null,"Mosha minimale p�r t� votuar �sht� 18!");}
        else { int vota=new Integer(JOptionPane.showInputDialog("P�r k� d�shironi t� votoni?")).intValue();
               if (vota!=1&&vota!=2)
               { JOptionPane.showMessageDialog(null,"Ky kandidat nuk ekziston!");
                 JOptionPane.showInputDialog("P�r k� d�shironi t� votoni?");}
                
         }
    }
  }
}