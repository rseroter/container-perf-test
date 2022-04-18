package model

type Employee struct {
	Id       string `json:"id"`
	FullName string `json:"fullname"`
	Location string `json:"location"`
	JobTitle string `json:"jobtitle"`
}
