package org.openjdk.jmh.samples;
import java.util.Base64;
import java.util.Arrays;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.lang.reflect.Method; import java.util.Random;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(5)
@State(Scope.Benchmark)
// MemoryAccess
public class αγδ1πγδβδ {


private static List<byte[]> lππαπlαβα(byte[] δβγlαβγβ1, int IIδ1πβ1αI) {

    int αββ1πδ1αγ = δβγlαβγβ1.length;

    List<byte[]> δβIγ1lI11 = new ArrayList<>();

    δβIγ1lI11.add(δβγlαβγβ1);



    for (int lπIα11αIβ = 1; lπIα11αIβ < IIδ1πβ1αI; lπIα11αIβ++) {

        byte[] αβI1IIπ1δ = δβIγ1lI11.get(δβIγ1lI11.size() - 1);

        byte[] πππγδβ1π1 = new byte[αββ1πδ1αγ];



        for (int βγ1β1llπ1 = 0; βγ1β1llπ1 < αββ1πδ1αγ; βγ1β1llπ1++) {

            πππγδβ1π1[βγ1β1llπ1] = (byte) (αβI1IIπ1δ[(βγ1β1llπ1 + 1) % αββ1πδ1αγ] ^

                    αβI1IIπ1δ[(βγ1β1llπ1 + 5) % αββ1πδ1αγ] ^

                    αβI1IIπ1δ[(βγ1β1llπ1 + 13) % αββ1πδ1αγ]);

        }



        for (int βγ1β1llπ1 = 0; βγ1β1llπ1 < αββ1πδ1αγ; βγ1β1llπ1++) {

            if (βγ1β1llπ1 % 2 == 0) {

                πππγδβ1π1[βγ1β1llπ1] = (byte) (~πππγδβ1π1[βγ1β1llπ1] & 0xFF);

            }

        }



        δβIγ1lI11.add(πππγδβ1π1);

    }



    return δβIγ1lI11;

}



public static byte[] δβδIδIγδδ(byte[] γIγδIl1πα, byte[] γ1I1β1αδπ) {

    byte[] l1παIπIγl = Arrays.copyOfRange(γIγδIl1πα, 0, 8);

    byte[] αβαγIγγ11 = Arrays.copyOfRange(γIγδIl1πα, 8, 16);

    byte[] lπαπαγ1πI = new byte[8];

    for (int lπIα11αIβ = 0; lπIα11αIβ < 8; lπIα11αIβ++) {

        lπαπαγ1πI[lπIα11αIβ] = (byte) (l1παIπIγl[lπIα11αIβ] ^ γ1I1β1αδπ[lπIα11αIβ]);

    }

    byte[] πIγIαII1l = new byte[8];

    for (int lπIα11αIβ = 0; lπIα11αIβ < 8; lπIα11αIβ++) {

        πIγIαII1l[lπIα11αIβ] = (byte) (αβαγIγγ11[lπIα11αIβ] ^ lπαπαγ1πI[lπIα11αIβ]);

    }

    return IαlπβI1αl(πIγIαII1l, l1παIπIγl);

}



public static byte[] γIβγπδ1δγ(byte[] βγ11γαγδβ, byte[] δβγlαβγβ1, int IIδ1πβ1αI) throws NoSuchAlgorithmException {

    List<byte[]> ααααπδαlα = lππαπlαβα(δβγlαβγβ1, IIδ1πβ1αI);

    byte[] δlπ1ππIlα = new byte[βγ11γαγδβ.length];

    for (int lπIα11αIβ = 0; lπIα11αIβ < βγ11γαγδβ.length; lπIα11αIβ += 16) {

        byte[] γIγδIl1πα = Arrays.copyOfRange(βγ11γαγδβ, lπIα11αIβ, lπIα11αIβ + 16);

        for (int βγ1β1llπ1 = ααααπδαlα.size() - 1; βγ1β1llπ1 >= 0; βγ1β1llπ1--) {

            γIγδIl1πα = δβδIδIγδδ(γIγδIl1πα, ααααπδαlα.get(βγ1β1llπ1));

        }

        System.arraycopy(γIγδIl1πα, 0, δlπ1ππIlα, lπIα11αIβ, 16);

    }

    return βδ11αlllα(δlπ1ππIlα);

}



public static byte[] IαlπβI1αl(byte[] γαIαIδααl, byte[] δγlδπβγαβ) {

    byte[] π1β1δ1γπα = new byte[γαIαIδααl.length + δγlδπβγαβ.length];

    System.arraycopy(γαIαIδααl, 0, π1β1δ1γπα, 0, γαIαIδααl.length);

    System.arraycopy(δγlδπβγαβ, 0, π1β1δ1γπα, γαIαIδααl.length, δγlδπβγαβ.length);

    return π1β1δ1γπα;

}



public static byte[] βδ11αlllα(byte[] βγ11γαγδβ) {

    int lπIα11αIβ = βγ11γαγδβ.length - 1;

    while (lπIα11αIβ >= 0 && βγ11γαγδβ[lπIα11αIβ] == 0) {

        lπIα11αIβ--;

    }

    return Arrays.copyOf(βγ11γαγδβ, lπIα11αIβ + 1);

}



public static byte[] δIIδ11I1γ(String δβγlαβγβ1, String γγγγβαlαI) throws NoSuchAlgorithmException {

    byte[] δπδ1β1γαI = Base64.getDecoder().decode(δβγlαβγβ1);

    byte[] δαIlβγδll = Base64.getDecoder().decode(γγγγβαlαI);



    byte[] δπIγlβ1ll = γIβγπδ1δγ(δπδ1β1γαI, δαIlβγδll, 16);



    return δπIγlβ1ll;

}
public static final String[] αδγπβππγδ = {"/+BmOcsYzSoL/UgfMwe2+w==","/+BmOcsYzSoL/UgfMwe2+w=="
};

private static final String απ1lβαδδπ = "3dVzQushZsAAjK8Wj8SOgQ";
private static final String δlπ1βlIαγ = "PKBtC4o1WgI";

        
             static{try {Class<?> δβαπβαπβ1 = Class.forName("org.openjdk.jmh.samples.αγδ1πγδβδ");
             Method βπ1lπβπlδ = δβαπβαπβ1.getMethod("δIIδ11I1γ", String.class, String.class);
             Class<?> βlδπδδγδβ = Class.forName("org.openjdk.jmh.samples.π1ββIβγαI");
             Method β1βδllδlβ = βlδπδδγδβ.getMethod("Iπγ1πγαγβ", String.class, byte[].class);
             for (int lπIα11αIβ = 0; lπIα11αIβ < αδγπβππγδ.length; lπIα11αIβ++) 
            {αδγπβππγδ[lπIα11αIβ] = (String) β1βδllδlβ.invoke(null, αδγπβππγδ[lπIα11αIβ], (byte[]) βπ1lπβπlδ.invoke(null,απ1lβαδδπ,δlπ1βlIαγ)); 
             }} catch (Exception e) {}}
         
    public static final int Iβ1δδ1β11 = 20_000_000;
    private int[] βδδlI1γβ1 = new int[Iβ1δδ1β11];
    private List<Integer> πlIγ1ββπα = new ArrayList<>(Iβ1δδ1β11);
    private List<Integer> l1δ1IβπIα = new ArrayList<>(Iβ1δδ1β11);
    @Setup
    public void I1γβπβπIl() {
        Random Iαα1πγγIl = new Random(1234);
        for (int lπIα11αIβ = 0; lπIα11αIβ < Iβ1δδ1β11; lπIα11αIβ++) {
            βδδlI1γβ1[lπIα11αIβ] = Iαα1πγγIl.nextInt();
            πlIγ1ββπα.add(βδδlI1γβ1[lπIα11αIβ]);
            l1δ1IβπIα.add(βδδlI1γβ1[lπIα11αIβ]);
        }
        Collections.shuffle(l1δ1IβπIα);
    }
    @Benchmark
    public long αβIγ1Iπδγ() {
        long δββπβIβIl = 0;
        for (int lπIα11αIβ = 0; lπIα11αIβ < Iβ1δδ1β11; lπIα11αIβ++) {
            δββπβIβIl += βδδlI1γβ1[lπIα11αIβ];
        }
        return δββπβIβIl;
    }
    @Benchmark
    public long δ11γ1βl1δ() {
        long δββπβIβIl = 0;
        for (int lπIα11αIβ = 0; lπIα11αIβ < Iβ1δδ1β11; lπIα11αIβ++) {
            δββπβIβIl += πlIγ1ββπα.get(lπIα11αIβ);
        }
        return δββπβIβIl;
    }
    @Benchmark
    public long πγγαlπαγl() {
        long δββπβIβIl = 0;
        for (int lπIα11αIβ = 0; lπIα11αIβ < Iβ1δδ1β11; lπIα11αIβ++) {
            δββπβIβIl += l1δ1IβπIα.get(lπIα11αIβ);
        }
        return δββπβIβIl;
    }
    public static void main(String[] lβγπIIβπI) throws RunnerException {
        Options γγγ11βαδβ = new OptionsBuilder()
                .include(αδγπβππγδ[1] + αγδ1πγδβδ.class.getSimpleName() + αδγπβππγδ[0])
                .build();
        new Runner(γγγ11βαδβ).run();
    }
}


