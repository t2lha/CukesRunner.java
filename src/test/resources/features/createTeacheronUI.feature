@Test2

  Feature: Creating A student on UI

    Scenario: Creating A student on UI
      Given user is on the main page
      When user clicks student
      And user needs to click add students
      Then user enter create student fields
      |firstName | Lionel |
      |lastName  | Messi  |
      |email     |lionel.messi61@gmail.com|
      |joiningDate| 12/15/2087           |
      |password    | trabzonspor61        |
      |confirmPass | trabzonspor61        |
      |subject     |football             |
      |phoneNumber|05322416916          |
      |gender      | female               |
      |admissionNo|3461                |
      |birthDate  |08/02/1967          |
      |major      | forward            |
      |batch      |B14                 |
      |section    |61616161            |
      |permanentAdd|1426 SBirch Dr Mt. Prospect IL 60056|
      |companyName        | KAYTRANS             |
      |title              | Transportation       |
      |startDate          |03/15/1976            |
      |city               | Mt Prospect          |
      |street             |1699 Wall St          |
      |state              |Illinois              |
      |zipcode                 |    60056                  |



