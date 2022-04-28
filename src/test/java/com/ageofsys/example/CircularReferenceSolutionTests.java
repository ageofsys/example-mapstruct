package com.ageofsys.example;

import com.ageofsys.example.circular_reference_solution.Menu;
import com.ageofsys.example.circular_reference_solution.MenuCircularReferenceMapper;
import com.ageofsys.example.circular_reference_solution.MenuDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author AGEOFSYS
 * @since 1.0
 */
class CircularReferenceSolutionTests {

    @Test
    void Should_ChildrenReferParentNode_When_NodeHasCircularReference() {
        Menu grandParent = new Menu("grandParent1");
        Menu parent1 = new Menu("parent1");
        Menu parent2 = new Menu("parent2");
        Menu child1 = new Menu("child1");
        Menu child2 = new Menu("child2");
        Menu child3 = new Menu("child3");

        grandParent.addChild(parent1);
        grandParent.addChild(parent2);
        parent1.addChild(child1);
        parent1.addChild(child2);
        parent2.addChild(child3);

        // ROOT 노드를 매개변수로 전달하였을 경우에는 정상적으로 맵핑된다.
        // 하지만 중간층에 있는 노드를 매개변수로 전달하게 되면 전달 받은 노드의 윗쪽(부모방향)에 있는 노드를 맵핑하지 못하게 된다.
        // 이건 당연한 결과다. 순환 참조를 하고 있기 때문에 부모 방향으로 맵핑을 진행하려면 결국 모든 노드들을 알고 있어야 한다.
        // 맵핑이 수행하는 역할을 생각해 본다면 전달된 데이터 내에서 데이터들을 맵핑해주는 것이 정상이다.

        MenuDto dto = MenuCircularReferenceMapper.map(grandParent);

        assertEquals(grandParent, parent1.getParent());
        assertEquals(grandParent, parent2.getParent());
        assertEquals(parent1, child1.getParent());
        assertEquals(parent1, child2.getParent());
        assertEquals(parent2, child3.getParent());
    }
}
