Feature: Task
  As a user I would like to know Is the task was created, updated and deleted?
  @test
  Scenario: Create Task
    Given I am on ticktick page
    And I press sign in button
    And I sign in as a user
    When I press on add list button
    And I send task name
    And I press on save button
    Then the task has to be visible on the page

  @test
  Scenario: Update Task
    Given I am on ticktick page
    And I press sign in button
    And I sign in as a user
    When I press on list task submenu button
    And I press on edit button
    And I send the name of task updated
    And I press on save button
    Then the task with the name updated has to be visible on the page

  @test
  Scenario: Delete Task
    Given I am on ticktick page
    And I press sign in button
    And I sign in as a user
    When I press on list task submenu button to delete
    And I press on delete button
    And I press on delete button to confirm
    Then the task with the name updated has not to be visible on the page