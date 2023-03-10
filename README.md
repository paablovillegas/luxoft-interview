# Code challenge

## Goal

The objective of this code challenge is to know the level of expertise of the candidate in topics related to algorithms, user interface design, git, jetpack compose, CI/CD, etc.
Please provide your own solution, you may know that the interviewer will ask questions about your implementation.

## Overview

We will be creating an app that allow us to search the countries from a specific continent. It should have an input that allows you to write the continent name (in english) and return the countries in it.
Once we have the list of countries we should be able to click on a country and see more details about it. Further information will be provided in the next sections.
We also will be able to store last countries visited, saving them in a database, if clicked on it, fetch the data again.
For this code challenge it is requested to use MVVM architecture, you can use REST or GraphQL (it's up to you).

## Git

1. Please switch to the following branch depending on your selection: `rest` or `graphql`.
2. Once you are in the selected branch please create a new branch with your first name and your first last name, EG: `john-doe`.
3. Generate as many commits as you want. Please provide details in each commit of what you have done.

## Fetching Data

If you have selected REST the endpoint used will be [this](https://restcountries.com), otherwise go to [this](https://github.com/trevorblades/countries) link.

1. All necessary dependencies are included in `rest` or `graphql` branch.
2. Generate all models required to fetch data.
3. Create as many files as you want, please keep business logic separated from ui files.

## Functionality

For this code challenge it is necessary to use Jetpack Compose to create views, all XML views will not be accepted.

### Main view

The view should have at least this components:
* A navbar with a menu `Recent searches`
* A search form
* A button to perform the search
* A list where to display the results

The logic should include the following:
* If no text is introduced return all the continents.
* If text is introduced to the form, perform the search of the continents requested, if no match are found, show a Snackbar with no info found.
* If a click is performed to an element of the results list navigate to the next view where all countries from the continent selected.
* If clicked on the navbar menu, navigate to a view where we have a list of the last countries visited and when they where visited (no image needed).

### Countries list view

The view should contain only the countries from the selected continent.
The title of the navbar should tell us which continent was selected.
Provide the following data from each country:
* Official name
* Official native name
* Currency
* Subregion
* Population
* Nice to have: A flag image from each country

### Country view

The view should contain the country selected
The title of the navbar should tell us which country was selected.
Provide the following data from the country:
* Official name
* Official native name
* Currency
* Region
* Subregion
* Population
* Capital(s)
* Area in square kilometers
* Demonym in english if existing
* Timezones
* Nice to have (if present in API):
    * A flag image from each country
    * Google map view of the country

### Recently visited countries

The view should contain the most recently visited countries, they should be stored in ROOM database.
The countries should be ordered by most recent visited.
If an item is clicked from the list, you should go to the country view so we can see the country information.
Once we click on back button, view should be updated, with the country visited in the first position.
In this case we require the following attributes:
* Official Name
* Official native name
* Region
* Population
