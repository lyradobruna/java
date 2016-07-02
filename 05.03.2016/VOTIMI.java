import javax.swing.*;
public class VOTIMI
{ public static void main(String[] args)
  { while (true)
    { int vjetët=new Integer(JOptionPane.showInputDialog("Sa vjet i keni?")).intValue();
      if (vjetët<18)
      { JOptionPane.showMessageDialog(null,"Mosha minimale për të votuar është 18!");}
        else { int vota=new Integer(JOptionPane.showInputDialog("Për kë dëshironi të votoni?")).intValue();
               if (vota!=1&&vota!=2)
               { JOptionPane.showMessageDialog(null,"Ky kandidat nuk ekziston!");
                 JOptionPane.showInputDialog("Për kë dëshironi të votoni?");}
                
         }
    }
  }
}