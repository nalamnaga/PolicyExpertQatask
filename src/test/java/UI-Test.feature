Feature: Submit Goto compare quote for home insurance


  Scenario Outline: Customer submit quote
    Given User navigate to Policydetails page
    And I select the below details as
      | Filedname |Xpathvalue|
      | <Title>             | 1  |
      | <Birthday>          | 2  |
      | <Month>             | 3  |
      | <Year>              | 4  |
      | <marital>           | 5  |
      | <PropertyType>      | 6  |
      | <Propertydescribe>  | 7  |
      | <Bedrooms>          | 8  |
      | <Bathrooms>         | 9  |
      | <Ownproperty>       | 10 |
      | <whooccupied>  | 11 |
      | <Adults>            | 12 |
      | <Children>          | 13 |
      | <propertyoccupied>  | 14 |
      | <homeinsurance>     | 15 |
      | <homeinsurancetype> | 16 |
      | <standardexcess>    | 17 |
    And I enter the values of following fields
      | <Firstname> | <Lastname> | <occupation> | <phonenumber> | <email> | <Address> | <Buildyear> | <marketvalue> | <rebuildcost> |
      | 1           | 2          | 3            | 4             | 5       | 6         | 7           | 8             | 9             |
    And I click the following butons
      | <otheroccupation> | <otherresidents> | <correspondantAddress> | <propertymainresidence> | <smoke> | <trees> | <flatroof> | <wallsstone> | <rooftiles> | <waterdamp> | <neightbourdamage> | <windowskeys> | <lockdoor> | <frenchpatiodoor> | <externaldoor> | <burglaralarm> | <Joinholder> | <homeinsuranceclaims> | <startdatecover> | <upgrade> |
      | 2                 | 4                | 5                      | 7                       | 10      | 12      | 14         | 15           | 17          | 19          | 22                 | 23            | 26         | 28                | 30             | 32             | 34           | 36                    | 38               | 40        |
    And I click on Gotocomparequotes button

    Examples:
      | Title | Firstname | Lastname | Birthday | Month | Year | marital | occupation    | otheroccupation | phonenumber | email                   | otherresidents | Address                         | correspondantAddress | PropertyType | Propertydescribe  | Noofflats | nooffloors | Buildyear | Bedrooms | Bathrooms | Ownproperty                              | whooccupied    | Adults | Children | propertyoccupied    | homeinsurance | homeinsurancetype | standardexcess | marketvalue | rebuildcost | propertymainresidence | smoke | trees | flatroof | wallsstone | rooftiles | waterdamp | neightbourdamage | windowskeys | lockdoor | frenchpatiodoor | externaldoor | burglaralarm | Joinholder | homeinsuranceclaims | startdatecover | upgrade |
      | Mrs   | Naga      | Nalam    | 2        | March | 1998 | Married | Web Developer | No              | 07758892267 | vketipisz@qmetric.co.uk | No             | 2 Bliss Way, Cambridge, CB1 9YE | Yes                  | House        | Maisonette | Yes       | No         | 1976      | 4        | 3         | Yes, I own the property, with a mortgage | You and your family | 4      | 3        | During the day | 2 years       | Buildings only    | £400           | £70000      | £100        | 7                     | No    | No    | No       | Yes        | Yes       | Yes       | No               | Yes         | No       | No              | No           | No           | No         | No                  | Tommorrow      | No      |