package main

import (
	"fmt"

	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
	"seroter.com/restapi/web"
)

func main() {
	fmt.Println("server started ...")

	e := echo.New()
	e.Use(middleware.Logger())

	e.GET("/employees", web.GetAllEmployees)

	e.Start(":8080")
}
