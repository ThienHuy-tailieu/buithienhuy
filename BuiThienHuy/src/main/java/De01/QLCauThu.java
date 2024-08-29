/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De01;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class QLCauThu {

    private ArrayList<CauThu> dsCauThu = new ArrayList<>();

    public QLCauThu() {
        
        dsCauThu.add(new CauThu(01, "Nguyen Van A", 2000, 1000, 200, 50));
        dsCauThu.add(new CauThu(02, "Nguyen Van B", 2000, 1300, 100, 0));
        dsCauThu.add(new CauThu(03, "Nguyen Van C", 2000, 1400, 100, 0));
        dsCauThu.add(new CauThu(04, "Nguyen Van D", 2000, 1400, 200, 0));
        dsCauThu.add(new CauThu(05, "Nguyen Van E", 2000, 1200, 500, 50));
        dsCauThu.add(new CauThu(06, "Nguyen Van F", 2000, 1200, 500, 50));
        dsCauThu.add(new CauThu(07, "Nguyen Van G", 2000, 1300, 400, 50));
        dsCauThu.add(new CauThu(12, "Nguyen Van H", 2000, 1400, 200, 0));
        dsCauThu.add(new CauThu(13, "Nguyen Van T", 2000, 1600, 400, 50));
        dsCauThu.add(new CauThu(10, "Nguyen Van U", 2000, 1500, 300, 0));
        dsCauThu.add(new CauThu(11, "Nguyen Van M", 2000, 1500, 300, 50));
    }
    public void inDS(){
        for (CauThu cauthu : dsCauThu) {
            System.out.println(dsCauThu);
        }

    }
    public boolean themCauThu(CauThu cauThu) {
        for (CauThu ct : dsCauThu) {
            if (ct.getSoao() == cauThu.getSoao()) {
                return false;
            }
        }
        dsCauThu.add(cauThu);
        return true;
    }
}
