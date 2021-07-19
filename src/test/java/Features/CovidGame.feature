Feature: COVID19 Game and Best Practices

  @regression
  Scenario: As a user, I should be able to play COVID19 game and check my score on the leader board
    Given The user is on the home page
    Then The user creates a new warrior
    Then The user chooses the battle field
    Then The user plays the game
    And The user can see score on the leaderboard