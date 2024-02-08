package handlers

import (
	"encoding/json"
	"log"
	"net/http"

	"github.com/OrangeAVA/Building-Large-Scale-Apps-with-Monorepo-and-Bazel/chapter-6/bazel_go/common/greetings"
)

func Greet(w http.ResponseWriter, r *http.Request) {
	log.SetPrefix("greetings: ")
	log.SetFlags(0)
	greeting, err := greetings.Hello("Javier")

	if err != nil {
		log.Fatal(err)
	}

	w.Write([]byte(greeting))

}

func GreetMany(w http.ResponseWriter, r *http.Request) {

	names := []string{"Prisca", "Nana", "Derin"}

	// Request greeting messages for the names.
	messages, err := greetings.Hellos(names)
	if err != nil {
		log.Fatal(err)
	}

	json.NewEncoder(w).Encode(messages)
}