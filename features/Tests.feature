@FrameworkTests

  Feature: As a user I want to find the longest and the shortest words in a sentence

    Scenario Outline: Find the longest and the shortest words in the sentence
      Given I am provided with a sentence: <sentence>
      When I check the sentence for the longest word
      And I check the sentence for the shortest word
      Then The longest word should be <longest>
      And The shortest word should be <shortest>

      Examples:
        | sentence                                                                                                                                                  | longest      |  shortest   |
        | The cow jumped over the moon.                                                                                                                             | jumped       | The         |
        | word word word word word                                                                                                                                  | word         | word        |
        | You realize you're not alone as you sit in your bedroom massaging your calves after a long day of playing tug-of-war with Grandpa Joe in the hospital.    | tug-of-war   | a           |
        | So long and thanks for the fish.                                                                                                                          | thanks       | So          |
        | A kangaroo is really just a rabbit on steroids.                                                                                                           | kangaroo     | A           |
        | He would only survive if he kept the fire going and he could hear thunder in the distance.                                                                | distance     | He          |
        | He told us a very exciting adventure story.                                                                                                               | adventure    | a           |
        | My dentist tells me that chewing bricks is very bad for your teeth.                                                                                       | dentist      | My          |
        | She borrowed the book from him many years ago and hasn't yet returned it.                                                                                 | borrowed     | it          |
        | Behind the window was a reflection that only instilled fear.                                                                                              | reflection   | a           |
        | As the rental car rolled to a stop on the dark road, her fear increased by the moment.                                                                    | increased    | a           |
        | I may struggle with geography, but I'm sure I'm somewhere around here.                                                                                    | geography    | I           |
        | Dolores wouldn't have eaten the meal if she had known what it actually was.                                                                               | wouldn't     | if          |