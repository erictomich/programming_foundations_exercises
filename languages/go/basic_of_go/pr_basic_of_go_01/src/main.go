package main

import (
	"fmt"
)

// UIComponentFactory define a interface para criar botões.
type UIComponentFactory interface {
	CreateButtonAddToGlossary() Button
	CreateButtonFavorite() Button
	CreateButtonReaded() Button
}

// ClassicUIComponentFactory é uma implementação de UIComponentFactory para o tema clássico.
type ClassicUIComponentFactory struct{}

func (f *ClassicUIComponentFactory) CreateButtonAddToGlossary() Button {
	return &ClassicUIButtonAddToGlossary{}
}

func (f *ClassicUIComponentFactory) CreateButtonFavorite() Button {
	return &ClassicUIButtonFavorite{}
}

func (f *ClassicUIComponentFactory) CreateButtonReaded() Button {
	return &ClassicUIButtonReaded{}
}

// DarkUIComponentFactory é uma implementação de UIComponentFactory para o tema escuro.
type DarkUIComponentFactory struct{}

func (f *DarkUIComponentFactory) CreateButtonAddToGlossary() Button {
	return &DarkUIButtonAddToGlossary{}
}

func (f *DarkUIComponentFactory) CreateButtonFavorite() Button {
	return &DarkUIButtonFavorite{}
}

func (f *DarkUIComponentFactory) CreateButtonReaded() Button {
	return &DarkUIButtonReaded{}
}

// UIConfigurator configura a UI com base no tema.
type UIConfigurator struct {
	theme string
}

func NewUIConfigurator(theme string) *UIConfigurator {
	return &UIConfigurator{theme: theme}
}

func (c *UIConfigurator) GetUIComponent() UIComponentFactory {
	switch c.theme {
	case "classic":
		return &ClassicUIComponentFactory{}
	case "dark":
		return &DarkUIComponentFactory{}
	default:
		panic(fmt.Sprintf("Unknown theme: %s", c.theme))
	}
}

// Button define a interface para botões.
type Button interface {
	Render()
}

// ClassicUIButtonAddToGlossary é uma implementação do botão para o tema clássico.
type ClassicUIButtonAddToGlossary struct{}

func (b *ClassicUIButtonAddToGlossary) Render() {
	fmt.Println("ClassicUIButtonAddToGlossary")
}

// ClassicUIButtonFavorite é uma implementação do botão para o tema clássico.
type ClassicUIButtonFavorite struct{}

func (b *ClassicUIButtonFavorite) Render() {
	fmt.Println("ClassicUIButtonFavorite")
}

// ClassicUIButtonReaded é uma implementação do botão para o tema clássico.
type ClassicUIButtonReaded struct{}

func (b *ClassicUIButtonReaded) Render() {
	fmt.Println("ClassicUIButtonReaded")
}

// DarkUIButtonAddToGlossary é uma implementação do botão para o tema escuro.
type DarkUIButtonAddToGlossary struct{}

func (b *DarkUIButtonAddToGlossary) Render() {
	fmt.Println("DarkUIButtonAddToGlossary")
}

// DarkUIButtonFavorite é uma implementação do botão para o tema escuro.
type DarkUIButtonFavorite struct{}

func (b *DarkUIButtonFavorite) Render() {
	fmt.Println("DarkUIButtonFavorite")
}

// DarkUIButtonReaded é uma implementação do botão para o tema escuro.
type DarkUIButtonReaded struct{}

func (b *DarkUIButtonReaded) Render() {
	fmt.Println("DarkUIButtonReaded")
}

func main() {
	configurator := NewUIConfigurator("dark")
	factory := configurator.GetUIComponent()

	// Usa a fábrica para criar e exibir botões
	factory.CreateButtonAddToGlossary().Render()
	factory.CreateButtonFavorite().Render()
	factory.CreateButtonReaded().Render()
}
