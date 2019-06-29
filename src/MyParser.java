/*
G:
    St  --> C D F I M R S W $
    C   --> c C'    | λ
    C'  --> d | p | a C"
    C"  --> l | t
    D   --> d D'    | λ
    D'  --> f | ate
    F   --> f F'    | λ
    F'  --> g | ree | i F"
    F"  --> le | nd
    I   --> id      | λ
    M   --> m M'    | λ
    M'  --> v | k M"
    M"  --> dir
    R   --> rm R'   | λ
    R'  --> M"      | λ
    S   --> su S'   | λ
    S'  --> do      | λ
    W   --> w W'    | λ
    W'  --> ho W"   | λ
    W"  --> ami     | λ
 */

import java.util.Scanner;

public class MyParser {

    static String token;
    static int head = 0;

    enum Type {
        a, c, d, e, f, g, h, i, k, l, m, n, o, p, r, s, t, u, v, w, End
    }

    public MyParser(String s) {
        token = s;
        head = 0;
        Start();
    }

    boolean belong;

    void success(boolean bb) {
        belong = bb;
    }

    boolean isBelong() {
        return belong;
    }

    Type getNext() {
        if (head < token.length()) {
            switch (token.charAt(head)) {
                case 'a':
                    return Type.a;
                case 'c':
                    return Type.c;
                case 'd':
                    return Type.d;
                case 'e':
                    return Type.e;
                case 'f':
                    return Type.f;
                case 'g':
                    return Type.g;
                case 'h':
                    return Type.h;
                case 'i':
                    return Type.i;
                case 'k':
                    return Type.k;
                case 'l':
                    return Type.l;
                case 'm':
                    return Type.m;
                case 'n':
                    return Type.n;
                case 'o':
                    return Type.o;
                case 'p':
                    return Type.p;
                case 'r':
                    return Type.r;
                case 's':
                    return Type.s;
                case 't':
                    return Type.t;
                case 'u':
                    return Type.u;
                case 'w':
                    return Type.w;
            }
        }
        return Type.End;
    }

    void Start() {
        Type nextType = getNext();
        switch (nextType) {
            case c:
                C();
                break;
            case d:
                D();
                break;
            case f:
                F();
                break;
            case i:
                I();
                break;
            case m:
                M();
                break;
            case r:
                R();
                break;
            case s:
                S();
                break;
            case w:
                W();
                break;
            default:
                success(false);
                // System.out.println("Illegal Start of String");
                break;
        }
    }

    void C() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case d:
            case p:
                End();
                break;
            case a:
                Ca();
                break;
            default:
                success(false);
                // System.out.println("C() Error");
                break;
        }
    }

    void Ca() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case l:
            case t:
                End();
                break;
            default:
                success(false);
                // System.out.println("Ca() Error");
                break;
        }
    }

    void D() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case f:
                End();
                break;
            case a:
                Da();
                break;
            default:
                success(false);
                // System.out.println("D() Error");
                break;
        }
    }

    void Da() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case t:
                Dat();
                break;
            default:
                success(false);
                // System.out.println("Da() Error");
                break;
        }
    }

    void Dat() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case e:
                End();
                break;
            default:
                success(false);
                // System.out.println("Dat() Error");
                break;
        }
    }

    void F() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case g:
                End();
                break;
            case r:
                Fr();
                break;
            case i:
                Fi();
                break;
            default:
                success(false);
                // System.out.println("F() Error");
                break;
        }
    }

    void Fr() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case e:
                Fre();
                break;
            default:
                success(false);
                // System.out.println("Fr() Error");
                break;
        }
    }

    void Fre() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case e:
                End();
                break;
            default:
                success(false);
                // System.out.println("Fre() Error");
                break;
        }
    }

    void Fi() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case l:
                Fre();
                break;
            case n:
                Fin();
                break;
            default:
                success(false);
                // System.out.println("Fi() Error");
                break;
        }
    }

    void Fin() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case d:
                End();
                break;
            default:
                success(false);
                // System.out.println("Fin() Error");
                break;
        }
    }

    void I() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case d:
                End();
                break;
            default:
                success(false);
                // System.out.println("I() Error");
                break;
        }
    }

    void M() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case v:
                End();
                break;
            case k:
                Mk();
                break;
            case a:
                Ma();
                break;
            default:
                success(false);
                // System.out.println("M() Error");
                break;
        }
    }

    void Mk() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case d:
                Mkd();
                break;
            default:
                success(false);
                // System.out.println("Mk() Error");
                break;
        }
    }

    void Mkd() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case i:
                Mkdi();
                break;
            default:
                success(false);
                // System.out.println("Mkd() Error");
                break;
        }
    }

    void Mkdi() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case r:
                End();
                break;
            default:
                success(false);
                // System.out.println("Mkdi() Error");
                break;
        }
    }

    void Ma() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case n:
                End();
                break;
            default:
                success(false);
                // System.out.println("Ma() Error");
                break;
        }
    }

    void R() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case m:
                Rm();
                break;
            default:
                success(false);
                // System.out.println("R() Error");
                break;
        }
    }

    void Rm() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case End:
                End();
                break;
            case d:
                Mkd();
                break;
            default:
                success(false);
                // System.out.println("R() Error");
                break;
        }
    }

    void S() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case u:
                Su();
                break;
            default:
                success(false);
                // System.out.println("S() Error");
                break;
        }
    }

    void Su() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case End:
                success(true);
                break;
            case d:
                Sud();
                break;
            default:
                success(false);
                // System.out.println("Su() Error");
                break;
        }
    }

    void Sud() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case o:
                End();
                break;
            default:
                success(false);
                // System.out.println("Sud() Error");
                break;
        }
    }

    void W() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case End:
                success(true);
                break;
            case h:
                Wh();
                break;
            default:
                success(false);
                // System.out.println("W() Error");
                break;
        }
    }

    void Wh() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case o:
                Who();
                break;
            default:
                success(false);
                // System.out.println("Wh() Error");
                break;
        }
    }

    void Who() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case End:
                success(true);
                break;
            case a:
                Whoa();
                break;
            default:
                success(false);
                // System.out.println("Who() Error");
                break;
        }
    }

    void Whoa() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case m:
                Whoam();
                break;
            default:
                success(false);
                // System.out.println("Whoa() Error");
                break;
        }
    }

    void Whoam() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case i:
                End();
                break;
            default:
                success(false);
                // System.out.println("Whoam() Error");
                break;
        }
    }

    void End() {
        head++;
        Type nextType = getNext();
        switch (nextType) {
            case End:
                success(true);
                break;
            default:
                success(false);
                // System.out.println("End() Error");
                break;
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println(new MyParser(new Scanner(System.in).next()).isBelong());
        }
    }
}
