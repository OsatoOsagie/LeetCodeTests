class GoodToKnow {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false // Step 1: Check if lengths are equal

        val charCount = IntArray(26) // Step 2: Array to count occurrences of each character

        for (char in s) { // Step 3: Count characters in the first string
            charCount[char - 'a']++ // Increment the count for the character
        }

        for (char in t) { // Step 4: Subtract counts for characters in the second string
            charCount[char - 'a']-- // Decrement the count for the character
            if (charCount[char - 'a'] < 0) { // Step 5: If count goes negative, it's not an anagram
                return false
            }
        }

        return true // Step 6: If no negative counts, the strings are anagrams
    }
}