package main

import (
	"errors"
	"log"

	// "io"
	"net/http"
	"os"

	"github.com/OrangeAVA/Building-Large-Scale-Apps-with-Monorepo-and-Bazel/chapter-6/bazel_go/src/handlers"
	"github.com/gorilla/mux"
)

func main() {

	router := mux.NewRouter()

	router.HandleFunc("/greet", handlers.Greet).Methods("GET")
	router.HandleFunc("/greet-many", handlers.GreetMany).Methods("GET")

	address := ":5000"

	log.Printf("server started at port %v\n", address)

	err := http.ListenAndServe(address, router)

	if errors.Is(err, http.ErrServerClosed) {
		log.Printf("server closed\n")
	} else if err != nil {
		log.Printf("error starting server: %s\n", err)
		os.Exit(1)
	}
}