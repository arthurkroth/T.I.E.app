/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method to retrieve online resources based on category and subcategory.
 * The resources are read from a file named "Resources_txt.txt".
 * The file is expected to have lines formatted as "category|subcategory|link1|link2".
 * Each line represents a category and its subcategory along with associated links.
 * Author: Cian O'Connor 
 * Student number: x22109668
 */
public class ResourceLinks {
     /**
     * Retrieves a list of online resources for a given category and subcategory.
     *
     * @param category    The category for which resources are requested.
     * @param subcategory The subcategory for which resources are requested.
     * @return A list of online resources associated with the specified category and subcategory.
     */
     public static List<String> getOnlineResources(String category, String subcategory) {
        // Initialize an empty list to store the retrieved resources
        List<String> resources = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/Resources_txt.txt"))) {
        String line;
        // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Split the current line using the pipe character ("|")
                String[] parts = line.split("\\|");
                // Check if the split result has at least 3 parts and matches the specified category and subcategory
                if (parts.length >= 3 && parts[0].trim().equalsIgnoreCase(category) && parts[1].trim().equalsIgnoreCase(subcategory)) {
                    // Iterate over the parts starting from index 2 (skipping category and subcategory)
                    for (int i = 2; i < parts.length; i++) {
                        // The loop adds each part (link) to the list of resources
                        // Trim is used to remove leading and trailing spaces from each link
                        resources.add(parts[i].trim()); 
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resources;

    }
}
