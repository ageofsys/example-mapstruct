package com.ageofsys.example.circular_reference_solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AGEOFSYS
 * @since 1.0
 */
public class MenuDto {
    public String name;
    public MenuDto parent;
    public List<MenuDto> children = new ArrayList<>();
}
