package web

import (
	"net/http"

	"github.com/labstack/echo/v4"
	"seroter.com/restapi/model"
)

func GetAllEmployees(c echo.Context) error {

	emps := [2]model.Employee{{Id: "100", FullName: "Jack Donaghy", Location: "NYC", JobTitle: "Executive"}, {Id: "101", FullName: "Liz Lemon", Location: "NYC", JobTitle: "Writer"}}
	return c.JSON(http.StatusOK, emps)
}
