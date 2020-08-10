package moreY;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    //Retorne uma lista de Strings cujos valores correspondam ao do original dado, porém com um "y" no início e fim.
    //Ex.:((["Lucas","job","ABA"]) -> ["yLucasy","yjoby","yABAy"]).

    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(str -> "y"+str+"y")
                .collect(Collectors.toList());
    }
}
