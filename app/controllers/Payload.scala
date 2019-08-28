package controllers

object Payload {
  val read = s"""
  {
    "AuthorizationEntryList": [
        {
            "Scopes": "HC.Applications.All.Read HC.CCMS.Self.All.Read/queue HC.CCMS.Self.MyCurrentAccount.Read/customers HC.CCMS.Self.MyCurrentAccount.Write/contacts HC.CCMS.Self.MyCurrentAccount.Write/customers HC.CCMS.Self.MyCurrentAccount.Write/users HC.Idm.Any.All.Subscriptions.Read/application HC.Idm.Any.All.Subscriptions.Read/subscriptions HC.Idm.Self.Me.ChangeLogonID/finishWithToken HC.Idm.Self.Me.ChangeLogonID/start HC.Idm.Self.Me.ChangePassword HC.Idm.Self.Me.UserProfile.Read/people/${user} HC.License.Activate/licenses/activate HC.License.Admin.Write/admin/customer HC.License.Admin.Write/admin/customers HC.License.Admin.Write/admin/user HC.License.Admin.Write/admin/users",
            "CustomerID": "476992",
            "CustomerName": "Dummy Company D11",
            "ContactIDs": "752944",
            "ContactFirstName": "M?tzler",
            "ContactLastName": "Markus",
            "Roles": "CCMS.Authorized",
            "Licenses": "",
            "CustomerOriginID": "0020301447",
            "ContactOriginID": "0000659058",
            "Street": "1 HOLLYWOOD STREET",
            "SecondaryName": "",
            "PostalCode": "10118",
            "City": "NEW YORK",
            "Country": "US"
        },
        {
            "Scopes": "HC.Applications.All.Read HC.CCMS.Self.All.Read/queue HC.CCMS.Self.MyCurrentAccount.Read/customers HC.CCMS.Self.MyCurrentAccount.Write/contacts HC.CCMS.Self.MyCurrentAccount.Write/customers HC.CCMS.Self.MyCurrentAccount.Write/users HC.Idm.Any.All.Subscriptions.Read/application HC.Idm.Any.All.Subscriptions.Read/subscriptions HC.Idm.Self.Me.ChangeLogonID/finishWithToken HC.Idm.Self.Me.ChangeLogonID/start HC.Idm.Self.Me.ChangePassword HC.Idm.Self.Me.UserProfile.Read/people/${user} HC.License.Activate/licenses/activate HC.License.Admin.Write/admin/customer HC.License.Admin.Write/admin/customers HC.License.Admin.Write/admin/user HC.License.Admin.Write/admin/users",
            "CustomerID": "477240",
            "CustomerName": "Dubya Inc DB* George W Bush",
            "ContactIDs": "504058",
            "ContactFirstName": "M?tzler",
            "ContactLastName": "Markus",
            "Roles": "CCMS.Authorized",
            "Licenses": "",
            "CustomerOriginID": "0020000021",
            "ContactOriginID": "0000656941",
            "Street": "5404 S 122ND EAST AVE",
            "SecondaryName": "Revised versionttest",
            "PostalCode": "74146-6007",
            "City": "TULSA",
            "Country": "US"
        },
        {
            "Scopes": "HC.Applications.All.Read HC.CCMS.Self.All.Read/queue HC.CCMS.Self.MyCurrentAccount.Read/customers HC.CCMS.Self.MyCurrentAccount.Write/contacts HC.CCMS.Self.MyCurrentAccount.Write/customers HC.CCMS.Self.MyCurrentAccount.Write/users HC.Idm.Any.All.Subscriptions.Read/application HC.Idm.Any.All.Subscriptions.Read/subscriptions HC.Idm.Self.Me.ChangeLogonID/finishWithToken HC.Idm.Self.Me.ChangeLogonID/start HC.Idm.Self.Me.ChangePassword HC.Idm.Self.Me.UserProfile.Read/people/${user} HC.License.Activate/licenses/activate HC.License.Admin.Write/admin/customer HC.License.Admin.Write/admin/customers HC.License.Admin.Write/admin/user HC.License.Admin.Write/admin/users",
            "CustomerID": "476424",
            "CustomerName": "M'linee Telik",
            "ContactIDs": "502909",
            "ContactFirstName": "first",
            "ContactLastName": "name",
            "Roles": "CCMS.Authorized",
            "Licenses": "",
            "CustomerOriginID": "0020184548",
            "ContactOriginID": "0000658905",
            "Street": "5400 S 122ND EAST AVE",
            "SecondaryName": "Information Systems-O/H P/R",
            "PostalCode": "74146-6099",
            "City": "TULSA",
            "Country": "US"
        }
    ]
}
  """

}