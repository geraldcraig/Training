import numpy as np
import pandas as pd
import pickle
from sklearn.model_selection import RandomizedSearchCV, GridSearchCV, train_test_split
from sklearn.neighbors import KNeighborsClassifier


data = pd.read_csv("diabetes.csv")

x = data.drop("Outcome", axis=1)
y = data["Outcome"]
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2)

knn = KNeighborsClassifier()
knn.fit(x_train, y_train)

# knn_score = knn.score(x_test, y_test)
# print(knn_score)

pickle.dump(knn, open('example_weights_knn.pkl', "wb"))