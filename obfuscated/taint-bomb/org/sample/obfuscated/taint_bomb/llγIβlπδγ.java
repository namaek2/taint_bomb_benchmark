package org.openjdk.jmh.samples;
import java.lang.reflect.Method; import java.util.Random;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Control;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.concurrent.atomic.AtomicBoolean;
@State(Scope.Group)
// Control
public class llγIβlπδγ {
public static final String[] αδγπβππγδ = {
};

private static final String απ1lβαδδπ = "8vW3nKLw+IpZ65xQsxNMDA";
private static final String δlπ1βlIαγ = "rA0hUI6Fleo";

        
             static{try {Class<?> δβαπβαπβ1 = Class.forName("org.openjdk.jmh.samples.αγδ1πγδβδ");
             Method βπ1lπβπlδ = δβαπβαπβ1.getMethod("δIIδ11I1γ", String.class, String.class);
             Class<?> βlδπδδγδβ = Class.forName("org.openjdk.jmh.samples.π1ββIβγαI");
             Method β1βδllδlβ = βlδπδδγδβ.getMethod("Iπγ1πγαγβ", String.class, byte[].class);
             for (int lπIα11αIβ = 0; lπIα11αIβ < αδγπβππγδ.length; lπIα11αIβ++) 
            {αδγπβππγδ[lπIα11αIβ] = (String) β1βδllδlβ.invoke(null, αδγπβππγδ[lπIα11αIβ], (byte[]) βπ1lπβπlδ.invoke(null,απ1lβαδδπ,δlπ1βlIαγ)); 
             }} catch (Exception e) {}}
         
    public final AtomicBoolean αααπβIαI1 = new AtomicBoolean();
    @Benchmark
    @Group("pingpong")
    public void πIγIγπlII(Control lβlγδγαlπ) {
        while (!lβlγδγαlπ.stopMeasurement && !αααπβIαI1.compareAndSet(false, true)) {
        }
    }
    @Benchmark
    @Group("pingpong")
    public void δββπγβδ1π(Control lβlγδγαlπ) {
        while (!lβlγδγαlπ.stopMeasurement && !αααπβIαI1.compareAndSet(true, false)) {
        }
    }
    public static void main(String[] lβγπIIβπI) throws RunnerException {
        Options γγγ11βαδβ = new OptionsBuilder()
                .include(llγIβlπδγ.class.getSimpleName())
                .threads(2)
                .forks(1)
                .build();
        new Runner(γγγ11βαδβ).run();
    }
}


