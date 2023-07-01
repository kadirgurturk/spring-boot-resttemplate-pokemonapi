package com.kadirgurturk.PoekmonRestTemplate.util;

public class Utils {
    private static final int GEN_I_S = 0;
    private static final int GEN_I_E = 151;
    private static final int GEN_II_S = 152;
    private static final int GEN_II_E = 252;
    private static final int GEN_III_S = 253;
    private static final int GEN_III_E = 406;
    private static final int GEN_IV_S = 407;
    private static final int GEN_IV_E = 514;
    private static final int GEN_V_S = 515;
    private static final int GEN_V_E = 670;



    public static int [] findGenBetweens(Integer gen){
        var between = new int [2];

        switch (gen){
            case 1: {
                between[0] = GEN_I_S;
                between[1] = GEN_I_S;
                break;
            }
            case 2: {
                between[0] = GEN_II_S;
                between[1] = GEN_II_S;
                break;
            }
        }

        return between;
    }
}
