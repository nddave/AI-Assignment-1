;; This is my canvas. This is my art.

;; Assignment information
;; ---
;; Class : Artificial Intelligence
;; Assignment : Make a program that does anything
;; Student : Nirman Dave

;; Program information
;; ---
;; Name : Patinc
;; Version : 1.0
;; Description : A program that identifies pattern between three numbers
;;				 and generates formulas for the pattern so that anyone
;;				 can easily predict the pattern using the formula.
;; Language : Clojure

;; Importing default libraries and name space
(ns patinc.core
  (:gen-class))

;; The program is divided into two parts.
;; 1) Pattern identification
;; 2) Formula Making

;; ====
;; PATTERN IDENTIFICATION
;; ====

;; This part of the program goes on to define two distinct pattern recognition tests.
;; One is for Arithmetic Progression, another is for Geometric Progression.

;; Defining test for Arithmetic progression, for three values.
(defn aptest [a b c]
	;; An 'if' condition identifies if the difference between numbers is the same or not.
	(if (= (- b a) (- c b)) 
		;; If the condition is satisfied, the following text is printed.
		"\nAP; conduct 'aform' for formula\n" 
		;; Else, the following text is printed.
		"not an AP"))

;; Defining test for Geometric progression, for three values.
(defn gptest [a b c]
	;; This uses the same code language for the 'aptest' module.
	;; An 'if' condition identifies if the division between numbers has the same result or not.
	(if (= (/ b a) (/ c b)) 
		"\nGP; conduct 'gform' for formula\n" 
		"not an GP"))

;; In most cases the user does not know what they are looking for in a pattern.
;; So therefore the following code runs both, the 'aptest' and the 'gptest', on the values given to find out
;; what the pattern is.

;; Defining test for an unknown pattern, 'patrec' stands for pattern recognition.
(defn patrec [a b c]
	(println (aptest a b c))
	(println (gptest a b c))
	)

;; ====
;; FORMULA MAKING
;; ====

;; Once the user is aware of the pattern in the numbers, it is now time to make a formula that defines the pattern.
;; Using this formula, the user can calculate the value of nth term in the pattern.

;; Defining formula for Arithmetic progression, for the three values.
(defn aform [a b c]
	;; The code splits the numbers into variables.
	(def first-number a)
	(def difference-value (- b a))
	;; Prints out the formula using the variables defined. 
	(println (str "\nnth term = " first-number " + ((n-1)*" difference-value ")\n"))
	)

;; Defining formula for Geometric progression, for the three values.
(defn gform [a b c]
	;; The code splits the numbers into variables.
	(def first-number a)
	(def r-value (/ b a))
	;; Prints out the formula using the variables defined.
	(println (str "\nnth term = (" first-number "(1-" r-value "^n)) / (1-" r-value ")\n" ))
	)
