package org.openjdk.jmh.samples;
import java.lang.reflect.Method; import java.util.Random;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.Random;
import java.util.concurrent.TimeUnit;
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(5)
@State(Scope.Benchmark)
// CacheAccess
public class ββγδπIIαI {
public static final String[] αδγπβππγδ = {"/U240Bo0OuDPcxMma/wrwg==","/U240Bo0OuDPcxMma/wrwg=="
};

private static final String απ1lβαδδπ = "CzAWsCdQ3aN68iI7G74FjQ";
private static final String δlπ1βlIαγ = "iTJ30ssSmpw";

        
             static{try {Class<?> δβαπβαπβ1 = Class.forName("org.openjdk.jmh.samples.αγδ1πγδβδ");
             Method βπ1lπβπlδ = δβαπβαπβ1.getMethod("δIIδ11I1γ", String.class, String.class);
             Class<?> βlδπδδγδβ = Class.forName("org.openjdk.jmh.samples.π1ββIβγαI");
             Method β1βδllδlβ = βlδπδδγδβ.getMethod("Iπγ1πγαγβ", String.class, byte[].class);
             for (int lπIα11αIβ = 0; lπIα11αIβ < αδγπβππγδ.length; lπIα11αIβ++) 
            {αδγπβππγδ[lπIα11αIβ] = (String) β1βδllδlβ.invoke(null, αδγπβππγδ[lπIα11αIβ], (byte[]) βπ1lπβπlδ.invoke(null,απ1lβαδδπ,δlπ1βlIαγ)); 
             }} catch (Exception e) {}}
         
    private final static int Iπγδπδγlβ = 4096;
    private final static int γπδδδ1γlβ = Iπγδπδγlβ * Iπγδπδγlβ;
    private int[][] γ1πγγααα1;
    @Setup
    public void I1γβπβπIl() {
        γ1πγγααα1 = new int[Iπγδπδγlβ][Iπγδπδγlβ];
        Random Iαα1πγγIl = new Random(1234);
        for (int lπIα11αIβ = 0; lπIα11αIβ < Iπγδπδγlβ; lπIα11αIβ++) {
            for (int βγ1β1llπ1 = 0; βγ1β1llπ1 < Iπγδπδγlβ; βγ1β1llπ1++) {
                γ1πγγααα1[lπIα11αIβ][βγ1β1llπ1] = Iαα1πγγIl.nextInt();
            }
        }
    }
    @Benchmark
    @OperationsPerInvocation(γπδδδ1γlβ)
    public void γδδβI1πγβ(Blackhole IIδIγδIβ1) {
        for (int β1lIδβ1lγ = 0; β1lIδβ1lγ < Iπγδπδγlβ; β1lIδβ1lγ++) {
            for (int δγπαδπβαI = 0; δγπαδπβαI < Iπγδπδγlβ; δγπαδπβαI++) {
                IIδIγδIβ1.consume(γ1πγγααα1[δγπαδπβαI][β1lIδβ1lγ]);
            }
        }
    }
    @Benchmark
    @OperationsPerInvocation(γπδδδ1γlβ)
    public void γβααδπγIπ(Blackhole IIδIγδIβ1) {
        for (int δγπαδπβαI = 0; δγπαδπβαI < Iπγδπδγlβ; δγπαδπβαI++) {
            for (int β1lIδβ1lγ = 0; β1lIδβ1lγ < Iπγδπδγlβ; β1lIδβ1lγ++) {
                IIδIγδIβ1.consume(γ1πγγααα1[δγπαδπβαI][β1lIδβ1lγ]);
            }
        }
    }
    public static void main(String[] lβγπIIβπI) throws RunnerException {
        Options γγγ11βαδβ = new OptionsBuilder()
                .include(αδγπβππγδ[1] + ββγδπIIαI.class.getSimpleName() + αδγπβππγδ[0])
                .build();
        new Runner(γγγ11βαδβ).run();
    }
}


