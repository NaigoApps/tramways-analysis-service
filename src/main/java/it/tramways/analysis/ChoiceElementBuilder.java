package it.tramways.analysis;

import it.tramways.analysis.api.model.ChoiceElement;

class ChoiceElementBuilder {

    private final ChoicePropertyBuilder parent;
    private final ChoiceElement element;

    public ChoiceElementBuilder(ChoicePropertyBuilder parent) {
        this.parent = parent;
        element = new ChoiceElement();
    }

    public ChoiceElementBuilder id(String id) {
        element.setId(id);
        return this;
    }

    public ChoiceElementBuilder label(String label) {
        element.setLabel(label);
        return this;
    }

    public ChoicePropertyBuilder end() {
        parent.option(element);
        return parent;
    }
}
