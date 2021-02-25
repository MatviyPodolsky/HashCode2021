package com.company.matviy;

import com.company.io.MatWriter;
import com.company.io.Reader;
import com.company.models.OutputData;

public class MatviyMain {

    public static void main(String[] args) {
        OutputData a = new Logic(new Reader("a.txt").read()).compute();
        new MatWriter("a.out").write(a);

        OutputData b = new Logic(new Reader("b.txt").read()).compute();
        new MatWriter("b.out").write(b);

        OutputData c = new Logic(new Reader("c.txt").read()).compute();
        new MatWriter("c.out").write(c);

        OutputData d = new Logic(new Reader("d.txt").read()).compute();
        new MatWriter("d.out").write(d);

        OutputData e = new Logic(new Reader("e.txt").read()).compute();
        new MatWriter("e.out").write(e);

        OutputData f = new Logic(new Reader("f.txt").read()).compute();
        new MatWriter("f.out").write(f);
    }

}
