package Archieve.GDublin;

import Archieve.GDub.ContainerWithMostWater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    @Test
    void maxArea() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        Assertions.assertEquals(49, containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        Assertions.assertEquals(1, containerWithMostWater.maxArea(new int[]{1, 1}));
    }
}