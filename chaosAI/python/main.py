"""
Basic setup to try and automate site building
"""

response = input("Please enter the name of the site: ")

def build_site(arg):
    """This is where we will actually build the site"""
    print("Site name is "+arg)

class StartBuilder:
    """Class is being used as the main running app"""
    def __init__(self, name):
        self.name = name
        build_site(self.name)

initBuilder = StartBuilder(response)
