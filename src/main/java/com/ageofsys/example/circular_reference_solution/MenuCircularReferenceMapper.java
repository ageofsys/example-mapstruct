package com.ageofsys.example.circular_reference_solution;

import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author AGEOFSYS
 * @since 1.0
 */
public class MenuCircularReferenceMapper {

    private MenuCircularReferenceMapper() {}

    private static MenuMapper menuMapper = Mappers.getMapper(MenuMapper.class);

    public static MenuDto map(Menu menu) {
        MenuDto menuDto = menuMapper.map(menu);
        applyParent(menuDto, menuDto.children);
        return menuDto;
    }

    private static void applyParent(MenuDto parent, List<MenuDto> children) {
        for (MenuDto child : children) {
            child.parent = parent;
            applyParent(child, child.children);
        }
    }
}
