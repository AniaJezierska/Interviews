#include <unordered_map>
#include <vector>
#include <cstdlib>
#include <iostream>

class RandomizedSet {
private:
    std::unordered_map<int, int> map; // Map to store <value, index> pairs
    std::vector<int> values; // Vector to store values
public:
    RandomizedSet() {
    }

    bool insert(int val) {
        // If the value already exists, return false
        if (map.find(val) != map.end())
            return false;

        // Add the value to the vector and map
        values.push_back(val);
        map[val] = values.size() - 1;
        return true;
    }

    bool remove(int val) {
        // If the value doesn't exist, return false
        if (map.find(val) == map.end())
            return false;

        // Get the index of the value to remove
        int index = map[val];

        // Move the last element to the index of the element to be removed
        values[index] = values.back();
        map[values.back()] = index;

        // Erase the last element
        values.pop_back();
        map.erase(val);

        return true;
    }

    int getRandom() {
        // Generate a random index within the range of the vector size
        int index = rand() % values.size();

        // Return the value at the randomly generated index
        return values[index];
    }
};

int main() {
    // Create an instance of RandomizedSet
    RandomizedSet randomizedSet;

    // Insert some values
    randomizedSet.insert(1);
    randomizedSet.insert(2);
    randomizedSet.insert(3);

    // Print a random value
    std::cout << "Random value: " << randomizedSet.getRandom() << std::endl;

    // Remove a value
    randomizedSet.remove(2);

    // Print a random value after removal
    std::cout << "Random value after removal: " << randomizedSet.getRandom() << std::endl;

    return 0;
}
