package com.detroitlabs.welcometothezoo;

import java.util.ArrayList;

/**
 * Created by kyleofori on 9/29/14.
 */
public class Zoo {
    private static ArrayList<Pen> AllZooPens = new ArrayList<Pen>();

    public void setAllZooPens(ArrayList<Pen> allZooPens) {
        AllZooPens = allZooPens;
    } //These names may be confusing because they only differ by capitalization.

    public static ArrayList<Pen> getAllZooPens() {
        return AllZooPens; //I feel like I'm using static incorrectly.
    }
}
