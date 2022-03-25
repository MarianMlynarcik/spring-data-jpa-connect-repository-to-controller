package test.java.com.codecademy.ccapplication;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.lang.annotation.Annotation;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.reflect.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.codecademy.plants.repositories.PlantRepository;
import com.codecademy.plants.controllers.PlantController;

class CurriculumTest {
  @Test
  void verify_has_correct_constructor() throws Exception {
    
    try {
      Class clazz = Class.forName("com.codecademy.plants.controllers.PlantController");
      
      Constructor c = clazz.getConstructor(new Class[]{ PlantRepository.class });
      
    } catch (ClassNotFoundException e) {
      Assertions.assertTrue(false, "Ensure you haven't deleted the `PlantController` class!");
    } catch (NoSuchMethodException e) {
      Assertions.assertTrue(false, "Ensure you have defined a constructor that initializes the `plantRepository` field.");
    }

  }
}