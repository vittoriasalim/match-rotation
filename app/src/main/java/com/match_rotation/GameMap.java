package com.match_rotation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.*;
import java.util.ArrayList;
import org.json.simple.*;
import java.util.*;
import org.json.simple.parser.*;


public class GameMap {
    private ArrayList <String>paths ;
    private ArrayList<Integer> time;
    private ArrayList<ArrayList<String>> map;
    public GameMap(){
        this.map = new ArrayList<>();
        this.paths = new ArrayList<>();
        this.time = new ArrayList<>();
    }

    public void loadMap(String fileName) throws JSONException {
        JSONObject root = new JSONObject(fileName);
        JSONArray levels = (JSONArray) root.get("levels");
        





    }


}
