package com.cookai.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity(name = "recipes")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecipeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @NotBlank(message = "title is required")
  @Column(name = "title")
  private String title;

  @NotEmpty(message = "ingredients is required")
  @ElementCollection
  @Column(name = "ingredients")
  private List<String> ingredients;

  @NotBlank(message = "instructions is required")
  @Column(name = "instructions", columnDefinition = "TEXT")
  private String instructions;
}